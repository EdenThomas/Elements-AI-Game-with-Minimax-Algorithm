package egame;

public class Logic
{
    boolean computerturn;
    int moveno = 0;
    String element1 = "Fire";
    String element2 = "Water";
    String element3 = "Wood";
    String DE,E1, E2;
    int s;
    int pf = 9;
    int pw = 9;
    int pwd = 9;
    int cf = 9; 
    int cw = 9;
    int cwd = 9;
    
    public void gamelogic()
    {   
        if (element1.equals(DE))
            {if (s==1)
                {
                    setDE(element2);
                    setE1(element3);
                    setE2(element1);
                    setPw(--pw);
                    setPf(++pf);
                }
            else
                {
                    setDE(element1);
                    setE1(element2);
                    setE2(element3);
                    setPwd(--pwd);
                    setCf(--cf);
                }
            }
        else if (element2.equals(DE))
            {if (s==1)
                {
                    setDE(element3);
                    setE1(element1);
                    setE2(element2);
                    setPwd(--pwd);
                    setPw(++pw);
                }
            else
                {
                    setDE(element2);
                    setE1(element3);
                    setE2(element1);
                    setPf(--pf);
                    setCw(--cw);
                }
            }
        else
            {if(s==1)
                {
                    setDE(element1);
                    setE1(element2);
                    setE2(element3);
                    setPf(--pf);
                    setPwd(++pwd);
                }
            else
                {
                    setDE(element3);
                    setE1(element1);
                    setE2(element2);
                    setPw(--pw);
                    setCwd(--cwd);
                }
            }
    }
    
    public void setComputerturn(boolean value)
    {
        computerturn = value; 
    }
    
    public void setmoveno(int value)
    {
        moveno = value;
    }
    
    public void setPf(int value) 
    {
        pf = value;
    }
    
    public void setCf(int value) 
    {
        cf = value;
    }
    
    public void setPw(int value) 
    {
        pw = value;
    }
    
    public void setCw(int value) 
    {
        cw = value;
    }
    
    public void setPwd(int value) 
    {
        pwd = value;
    }
    
    public void setCwd(int value) 
    {
        cwd = value;
    }
    
    public void setDE(String value) 
    {
        DE = value;
    }
    
    public void setE1(String value) 
    {
        E1 = value;
    }
    
    public void setE2(String value) 
    {
        E2 = value;
    }
    
    public void setS(int value) 
    {
        s = value;
    }
    
    public String getDE() {
        return DE;
    }
    
    public int getPw() {
        return pw;
    }
    
    public int getPf() {
        return pf;
    }
    
    public int getPwd() {
        return pwd;
    }
    
    public int getCw() {
        return cw;
    }
    
    public int getCf() {
        return cf;
    }
   
    public int getCwd() {
        return cwd;
    }
    
    public int getcscore(){
      return cf+cw+cwd;
    }
    
    public int getpscore(){
      return pf+pw+pwd;
    }
    
    public void makeComputerMove() {
    Minimax minimax = new Minimax(this);
    int bestMove = minimax.findBestMove(10);
    switch (bestMove) {
        case 1:
            setS(1);
            break;
        case 2:
            setS(2);
            break;
    }
    setComputerturn(false);
    gamelogic();
    }
    
    public String Winner(){
        
        int pscore=pf+pw+pwd;
        int cscore=cf+cw+cwd;
        
        if (pscore>cscore)
        {
            return "The player wins!";
        }
        else if (pscore>cscore)
        {
            return "The computer wins wins!";
        }
        else
        {
            return "The game is a draw";
        }
    }
    
}