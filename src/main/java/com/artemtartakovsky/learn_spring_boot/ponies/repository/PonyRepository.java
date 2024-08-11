package com.artemtartakovsky.learn_spring_boot.ponies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artemtartakovsky.learn_spring_boot.ponies.bean.Pony;

public interface PonyRepository extends JpaRepository<Pony, Long> {

}
