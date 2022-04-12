package com.reservationonline.user.registration.token;

import com.reservationonline.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmationToken {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String token;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime expires;
    private LocalDateTime confirmedAt;
    
    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "user_id"
    )
    private User user;
    
    public ConfirmationToken(final String token,
                             final LocalDateTime createdAt,
                             final LocalDateTime expires,
                             final User user) {
        this.token = token;
        this.createdAt = createdAt;
        this.expires = expires;
        this.user = user;
    }
}
