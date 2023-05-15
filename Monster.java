package com.skillstorm.projects;

public class Monster {
	
private int monsterHP;
private int monsterAtk;

public Monster() {}
public Monster(int monsterHP, int monsterAtk) {
	this.monsterHP = monsterHP;
	this.monsterAtk = monsterAtk;
	
}

public int getMonsterHP() {
	return monsterHP;
}

public void setMonsterHP(int monsterHP) {
	this.monsterHP = monsterHP;
}


public int getMonsterAtk() {
	return monsterAtk;
}


public void setMonsterAtk(int monsterAtk) {
	this.monsterAtk = monsterAtk;
}

}
