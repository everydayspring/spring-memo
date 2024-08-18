package com.sparta.springmemo.repository;

import com.sparta.springmemo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}