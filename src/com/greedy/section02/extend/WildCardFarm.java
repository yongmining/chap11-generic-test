package com.greedy.section02.extend;

public class WildCardFarm {
	
	/* �䳢���忡 �ִ� �䳢�� � �䳢�̴� ��� ����. */
	public void anyType(RabbitFarm<?> farm) {
		farm.getAnimal().cry();
	}
	
	/* �䳢������ �䳢�� �ٴ� �̰ų� �� �ļ� Ÿ������ ������� �䳢���常 �Ű������� ��� ���� */
	public void extendsType(RabbitFarm<? extends Bunny> farm) {
		farm.getAnimal().cry();
	}
	
	/* �䳢 ������ �䳢�� Bunny�̰ų� �� �θ� Ÿ������ ������� �䳢���常 �Ű������� ��� ���� */
	public void superType(RabbitFarm<? super Bunny> farm) {
		farm.getAnimal().cry();
	}
}
