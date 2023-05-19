package egame;

public class Minimax {
    
    private Logic game;
    
    public Minimax(Logic game) {
        this.game = game;
    }
    
    public int minimax(int depth, boolean maximizingPlayer) {
        if (depth == 0) {
            // Evaluate the score of the current game state
            return game.cw + game.cf + game.cwd - game.pw - game.pf - game.pwd;
        }
        int bestValue;
        if (maximizingPlayer) {
            bestValue = Integer.MIN_VALUE;
            for (int i = 1; i <= 2; i++) {
                Logic newGame = new Logic();
                newGame.setComputerturn(!game.computerturn);
                newGame.setPf(game.pf);
                newGame.setCf(game.cf);
                newGame.setPw(game.pw);
                newGame.setCw(game.cw);
                newGame.setPwd(game.pwd);
                newGame.setCwd(game.cwd);
                newGame.setDE(game.DE);
                newGame.setE1(game.E1);
                newGame.setE2(game.E2);
                newGame.setS(i);
                newGame.gamelogic();
                int v = minimax(depth - 1, false);
                if (v > bestValue) {
                    bestValue = v;
                }
            }
        } else {
            bestValue = Integer.MAX_VALUE;
            for (int i = 1; i <= 2; i++) {
                Logic newGame = new Logic();
                newGame.setComputerturn(!game.computerturn);
                newGame.setPf(game.pf);
                newGame.setCf(game.cf);
                newGame.setPw(game.pw);
                newGame.setCw(game.cw);
                newGame.setPwd(game.pwd);
                newGame.setCwd(game.cwd);
                newGame.setDE(game.DE);
                newGame.setE1(game.E1);
                newGame.setE2(game.E2);
                newGame.setS(i);
                newGame.gamelogic();
                int v = minimax(depth - 1, true);
                if (v < bestValue) {
                    bestValue = v;
                }
            }
        }
        return bestValue;
    }
    
    public int findBestMove(int depth) {
        int bestValue = Integer.MIN_VALUE;
        int bestMove = -1;
        for (int i = 1; i <= 2; i++) {
            Logic newGame = new Logic();
            newGame.setComputerturn(!game.computerturn);
            newGame.setPf(game.pf);
            newGame.setCf(game.cf);
            newGame.setPw(game.pw);
            newGame.setCw(game.cw);
            newGame.setPwd(game.pwd);
            newGame.setCwd(game.cwd);
            newGame.setDE(game.DE);
            newGame.setE1(game.E1);
            newGame.setE2(game.E2);
            newGame.setS(i);
            newGame.gamelogic();
            int v = minimax(depth - 1, false);
            if (v > bestValue) {
                bestValue = v;
                bestMove = i;
            }
        }
        return bestMove;
    }
    
}