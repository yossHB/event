package en.univercity.event.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "member")
public class MemberModel implements UserDetails {
    @Id
    @SequenceGenerator(
            name="User_Sequence" ,
            sequenceName = "User_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator = "User_Sequence"
    )
    private Long id;

    private String name;
    private String lastname;
    private String email;
    private int number;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole UserRole;
    private Boolean enabled = false;
    private Boolean locked = false;

    public MemberModel(
            String name,
            String lastname,
            String email,
            String password,
            en.univercity.event.models.UserRole userRole
    ) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.UserRole = userRole;
        this.enabled = enabled;
        this.locked = locked;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(UserRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }


    public String getFirstName() {
        return name;
    }

    public String getLastName() {
        return lastname;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}
