package com.duellingwands.spells.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duellingwands.spells.model.Spell;

public interface SpellRepository extends JpaRepository<Spell, Long> {

	Spell findById(int id);
}