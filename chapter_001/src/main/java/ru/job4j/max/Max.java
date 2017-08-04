package ru.job4j.max;

/**
 *
 * @author Evgeny Popov (36furious@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {
	/**
     * @param int first
	 * @param int second
     */
	public int max(int first, int second) {
		return first > second ?  first :  second;
	
	}

	public int max(int first, int second, int third) {
	return max(max(first, second), third);
	}
	

} 