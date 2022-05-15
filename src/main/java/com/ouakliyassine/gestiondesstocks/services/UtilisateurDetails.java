package com.ouakliyassine.gestiondesstocks.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ouakliyassine.gestiondesstocks.entites.Admin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class UtilisateurDetails implements UserDetails {
        private static final long serialVersionUID = 1L;

        private Long id;

        private String username;

        private String email;

        @JsonIgnore
        private String password;


	public UtilisateurDetails(Long id, String username, String email, String password) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public static UtilisateurDetails build(Admin utilisateur) {


            return new UtilisateurDetails(
                    utilisateur.getId(),
                    utilisateur.getUsername(),
                    utilisateur.getEmail(),
                    utilisateur.getPassword()
                    );
        }



        public Long getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
        public String getPassword() {
            return password;
        }

        @Override
        public String getUsername() {
            return username;
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            UtilisateurDetails user = (UtilisateurDetails) o;
            return Objects.equals(id, user.id);
        }
    }
