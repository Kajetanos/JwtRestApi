package com.rest.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.h2.tools.Server;

import java.sql.SQLException;


//@ComponentScan(basePackages = {"com.rest.jwt"})
//@EntityScan("com.rest.jwt.model")
//@EnableJpaRepositories(/*"com.rest.jwt.model"*/)
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = CandyRepository.class)
//@ComponentScan("com.rest.jwt")
public class JwtApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(JwtApplication.class, args);
	}

//	@Bean(initMethod = "start", destroyMethod = "stop")
//	@Bean(destroyMethod = "stop")
//	public Server inMemoryH2DatabaseServer() throws SQLException, SQLException {
//		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "8082").start();
//	}
    @Bean(destroyMethod = "stop")
    public Server inMemoryH2DatabaseServer() throws SQLException, SQLException {
        Server server = null;
        try {
            server = Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort",
                    "8083").start();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
        return server;
    }
}
