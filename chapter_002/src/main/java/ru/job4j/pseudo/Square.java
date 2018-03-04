package ru.job4j.pseudo;

/**
 * @author Popov Evgeny (36furious@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Square implements Shape  {

    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("+++++++");
        pic.append("+     +");
        pic.append("+     +");
        pic.append("+++++++");
        return pic.toString();
    }
}
