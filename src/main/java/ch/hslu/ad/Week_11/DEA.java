package ch.hslu.ad.Week_11;

public class DEA {

    // Die möglichen Zustände
    enum State {
        Z0,
        Z1,
        Z2,
        Z3,
        Z4, 
        Z5
    }

    // Die möglichen Ereignisse
    enum Event {
        ZERO,
        ONE
    }

    private State currentState;

    public DEA() {
        currentState = State.Z0; // Initialzustand
    }

    public void handleEvent(Event event) {
        switch (currentState) {
            case Z0:
                if (event == Event.ZERO) {
                    currentState = State.Z1;
                }else{
                    currentState = State.Z5;
                }
                break;

            case Z1:
                if (event == Event.ONE){
                    currentState = State.Z2;
                }else{
                    currentState = State.Z5;
                }
                break;

            case Z2:
                if (event == Event.ONE) {
                    currentState = State.Z3;
                }else if (event == Event.ZERO) {
                    currentState = State.Z4;
                }else{
                    currentState = State.Z5;
                }
                break;
            
            case Z3:
                if (event == Event.ONE) {
                    currentState = State.Z2;
                }else{
                    currentState = State.Z5;
                }
                break;

            case Z4:
                if (event == Event.ONE) {
                    currentState = State.Z2;
                }else{
                    currentState = State.Z5;
                }
                break;
            
            case Z5:
                break;
                
        }
    }

    public boolean isWordLanguage(final String s){
        char[] binary = s.toCharArray();
        for (char c : binary) {
            if (c == '1') {
                handleEvent(Event.ONE);
            }else if (c == '0') {
                handleEvent(Event.ZERO);
            }else{
                currentState = State.Z5;
            }
        }
        System.out.println(currentState);
        if (currentState == State.Z1 || currentState == State.Z4) {
            return true;
        }else{
            return false;
        }
    }  
}

