package com.example.TiendaJoya.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DatabaseWebSecurity extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select username,Password,Estatus from Administradores where username=?")
				.authoritiesByUsernameQuery("select u.username, p.rol from adminrol up "
						+ "inner join Administradores u on u.id = up.IdAmin " + "inner join Rol p on p.id = up.idRol "
						+ "where u.username= ?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	// Los recursos estáticos no requieren autenticación
	.antMatchers( 
	"/css/**",
	"/fonts/**",
	"/img/**",
	"/js/**",
	"/scss/**",
	"/logos/**").permitAll()
	// Las vistas públicas no requieren autenticación
	.antMatchers("/", 
	"/signup",
	"/about/**",
	"/shop/**",
	"/productos/view/**").permitAll()
	
	// Asignar permisos a URLs por ROLES
	.antMatchers("/productos/**").hasAnyAuthority("SUPERVISOR","ADMINISTRADOR")
	.antMatchers("/categorias/**").hasAnyAuthority("SUPERVISOR","ADMINISTRADOR") 
	.antMatchers("/administradores/**").hasAnyAuthority("ADMINISTRADOR")

	
	// Todas las demás URLs de la Aplicación requieren autenticación
	.anyRequest().authenticated()
	// El formulario de Login no requiere autenticacion
	.and().formLogin().permitAll();
	}
	} 

