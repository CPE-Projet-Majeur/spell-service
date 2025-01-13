package com.duellingwands.spells.service;

import java.util.List;

import com.duellingwands.spells.model.Spell;
import com.duellingwands.spells.repository.SpellRepository;

public class SpellService {
	private final SpellRepository spellRepository;

    public SpellService(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public List<Spell> getAllSpells() {
        return spellRepository.findAll();
    }
}
