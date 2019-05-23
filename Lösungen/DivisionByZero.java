package de.baberlin;
/*
 * Created on 10.05.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author gert.faustmann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DivisionByZero extends ArithmeticException{

    private static final long serialVersionUID = 6479335682486560680L;

    public DivisionByZero(){
        super();
    }
    
    public DivisionByZero(String message){
        super(message);
    }
}
