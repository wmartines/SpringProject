package br.com.spring.type;



public enum CharacterType {
	
	BARBARIAN(1),
	MAGE(2),
	PALADIN(3),
	DRUID(4),
	NOT_FOUND(5);
	
	private final int id;

	CharacterType(int id) {
		this.id = id;
	}

	public static CharacterType getById(int id) {
		for (CharacterType e : CharacterType.values()) {
			if (e.getValue() == id) {
				return e;
			}
		}
		return NOT_FOUND;// not found
	}

	public static CharacterType getByName(String name) {
		for (CharacterType e : CharacterType.values()) {
			if (e.name().equals(name.trim())) {
				return e;
			}
		}
		return NOT_FOUND;// not found
	}

	public int getValue() {
		return id;
	}

	public int getId() {
		return id;
	}
}
