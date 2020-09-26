package commun.card;

import commun.effect.IEffect;


/**
 *  Représente une carte dans 7Wonders
 */
public class Card {
	
	private final IEffect cardEffect;
	private String name;
	private CardType type;
	private int age;

	/**
	 *
	 * @param name Le nom de la carte
	 * @param type Le type de la carte
	 * @param cardEffect Effet de la carte ( gains...)
	 * @param age  Age de la carte
	 *
	 */
	
	public Card(String name, CardType type , IEffect cardEffect, Integer age) {
		this.cardEffect = cardEffect;
		this.name = name;
		this.type = type;
		this.age = age;

	}

	/**
	* @return Retourne l'effet de la carte
	 */
	public IEffect getCardEffect() {
		return cardEffect;
	}

	/**
	 * @return Retourne le nom de la carte
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Retourne le type de la carte
	 */
	public CardType getType() {
		return type;
	}

	/**
	 * @return Retourne l'age de la carte
	 */
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
