package com.ayesha.journal.repositary;

import com.ayesha.journal.entity.entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface entryRep extends JpaRepository <entry,Integer> {

}
