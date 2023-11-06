package com.application.jobchamb.repositories;

import com.application.jobchamb.entities.Areas;
import com.application.jobchamb.entities.Preferences;
import com.application.jobchamb.entities.Users;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.User;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JobRepositoryTest {
    public void reqPref(){
        Users users= Users.builder()
                .name("Jose")
                .lastname("Perez")
                .phone("45045454")
                .status(1)
                .company(1)
                .description("fbdfdf")
                .photo(null)
                .curriculum(null)
                .email("sdnnsdfn@sns.com")
                .password("snidfnsindinfv")

                .build();
        Areas areas= Areas.builder()
                .area("tecnologia")
                .build();
        Preferences preferences= Preferences.builder()
                .id_user(users)
                .id_area(areas)
                .build();

    }


}