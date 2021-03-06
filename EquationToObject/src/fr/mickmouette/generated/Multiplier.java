package fr.mickmouette.generated;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;

/**
 *  This project is a library developed for java object developers. It provide a way to easily manipulate infix mathematical equations.
 *  Copyright (C) 2017  Mickael Alvarez
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Contact : alvarez.mickael.93@gmail.com
 * 
 * @author Mickael Alvarez
 *
 * @param <V>
 */
public abstract class Multiplier<V> extends BinaryOperator<V> {

	public Multiplier(IEquation<V> leftOperand, IEquation<V> rightOperand) {
		super(leftOperand, rightOperand);
	}

}
