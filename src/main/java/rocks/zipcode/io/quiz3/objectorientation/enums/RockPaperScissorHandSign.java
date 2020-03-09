package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    SIGN,
    ROCK,
    PAPER,
    SCISSOR;


    public RockPaperScissorHandSign getLoser() {
        if (ROCK == RockPaperScissorHandSign.valueOf("ROCK")) return SCISSOR;
        if (PAPER == RockPaperScissorHandSign.valueOf("PAPER")) return ROCK;
        if (SCISSOR == RockPaperScissorHandSign.valueOf("SCISSOR")) return PAPER;
        return null;
    }

    public RockPaperScissorHandSign getWinner() {
        if (ROCK == RockPaperScissorHandSign.valueOf("ROCK")) return PAPER;
        if (PAPER == RockPaperScissorHandSign.valueOf("PAPER")) return SCISSOR;
        if (SCISSOR == RockPaperScissorHandSign.valueOf("SCISSOR")) return ROCK;
        return null;
    }


}
