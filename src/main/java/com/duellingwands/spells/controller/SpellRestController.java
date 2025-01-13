package com.duellingwands.spells.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duellingwands.spells.model.Spell;
import com.duellingwands.spells.service.SpellService;

public class SpellRestController {
	private final SpellService spellService;
	
	public SpellRestController(SpellService spellService) {
		this.spellService = spellService;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/spells")
    private List<Spell> getAllSpells() {
		return spellService.getAllSpells();
    }
}
