package com.siva.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Marks {
	@Value("80")
	private int siense;
	@Value("90")
	private int maths;
	@Value("75")
	private int physics;

	public int getSiense() {
		return siense;
	}

	public void setSiense(int siense) {
		this.siense = siense;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int sum() {
		int sum = siense + maths + physics;
		return sum;

	}

	@Override
	public String toString() {
		return "Marks [siense=" + siense + ", maths=" + maths + ", physics=" + physics + "]";
	}

}
