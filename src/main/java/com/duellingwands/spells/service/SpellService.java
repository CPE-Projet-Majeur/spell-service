package com.duellingwands.spells.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duellingwands.spells.model.Spell;
import com.duellingwands.spells.repository.SpellRepository;

@Service
public class SpellService {
	private final SpellRepository spellRepository;

    public SpellService(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public List<Spell> getAllSpells() {
        return spellRepository.findAll();
    }
    
    public Spell getSpell(int id) {
        return spellRepository.findById(id);
    }
}
