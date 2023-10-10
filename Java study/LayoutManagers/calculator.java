 import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Component;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
class calculator extends JFrame implements ActionListener
{
  //graphical features' variables
  private int toStoreFeatures=0;
  JButton g=new JButton("g");
  TextArea display = new TextArea( "", 1, 40, TextArea.SCROLLBARS_NONE );
  private String[] buttonNames={"Backspace","CE","C","7","8","9","/","sqrt","4","5","6","*","%","1","2","3","-","1/x","0","+/-",",","+","=","     M","MC","MR","MS","M+"};
  private Component [] features=new Component[28];
  private JPanel bReg1 = new JPanel();
  private JPanel bReg2 = new JPanel();
  private  JPanel labelReg = new JPanel();
  private  JPanel buttonArea = new JPanel();
 
  // variables to manage operations
  private String textOnScreen="0";
  private String memory="0";
  private boolean validOp=false;
  private boolean concDigit=false;//decides if the digit pressed by the user must be concatenate or simply replace the existing one
  private String errorMessage;
  private String currentOp=null;
  private Operation proceedOp=null;//object wich will be created each time to proceed a new operation
  private boolean Bakspace=true;
  private boolean currCharIsCom=false;
  private boolean isDouble=false;//tells if the number on screen is double(to check if it already has the comma)

  calculator()
  {
    super("calculator");
    bReg1.setLayout(new java.awt.GridLayout(5,1,10,10));   
    bReg1.add(nextButtonGrid(1,3,10,10));
    bReg1.add(nextButtonGrid(1,5,10,10));
    bReg1.add(nextButtonGrid(1,5,10,10));
    bReg1.add(nextButtonGrid(1,5,10,10));
    bReg1.add(nextButtonGrid(1,5,10,10));
    bReg2.setLayout(new java.awt.GridLayout(5,1,10,10));
    bReg2.add(nextButtonGrid(1,1,10,10));
    bReg2.add(nextButtonGrid(1,1,10,10));
    bReg2.add(nextButtonGrid(1,1,10,10));
    bReg2.add(nextButtonGrid(1,1,10,10));
    bReg2.add(nextButtonGrid(1,1,10,10));
    buttonArea.setLayout(new java.awt.BorderLayout(15,15));
    buttonArea.add(bReg2, java.awt.BorderLayout.WEST);
    buttonArea.add(bReg1,java.awt.BorderLayout.CENTER);
    enrobComponent(buttonArea,true,true,true,true);
    /**display.setOpaque(true);
    display.setBackground(Color.white);
    display.setBorder(new LineBorder(Color.gray)); */
    display.setBackground( Color.WHITE);
    display.setEditable( false );
    labelReg.add(display);
    setLayout(new java.awt.BorderLayout());
    add(enrobComponent(labelReg,true,true,false,true),java.awt.BorderLayout.NORTH);
    add(enrobComponent(buttonArea,true,true,true,true),java.awt.BorderLayout.CENTER);
    int i=0; while(i!=23){((JButton)features[i]).addActionListener(this);if(i==22){i=23;} if(i==27){i=22;}System.out.println("Still in! "+i);i++;}
   
    manageMemory("MC");
    manageErasers("CE");
    pack();
    setVisible(true);
  }
  //class operation dont les instances devront executer chaque nouvelle operation
 
  public static class Operation{
   public String param1;
   public String param2;
   public String currentOp;
   public String percent;
   public String lastOp;
   
    private Operation(String par1,String op,String par2){
   
      param1=par1; param2=par2; currentOp=op;percent=null; lastOp=null;//initialising the parameters of the object operation
    }
   
    private String eval(){
      return param1;
    }
    private void replaceOp(String op){currentOp=op;}
  }
     
  public void actionPerformed(ActionEvent e) { boolean done=false;int k;//mettre une lettre commune devant les noms de tous les boutons ayant les memes methodes
                                                                        //aurait rendu leur identification bien plus facile et plus generale; mais l'idee m'est venu apres cet implementation un peut compliquee
    for(k=0;k<features.length&&!done;k++){if(e.getSource()==features[k]){done=true;k--;}}
    String repere=buttonNames[k];
    try{Double.parseDouble(textOnScreen);
    try{ if(Integer.parseInt(repere)<10){manageDigits(repere);}}catch(NumberFormatException ex){ if(repere.charAt(0)=='M'){
      manageMemory(repere);}else if(repere.charAt(0)=='B'||repere.charAt(0)=='C'){manageErasers(repere);}else if(repere.charAt(0)==','){
        comma();}else if(repere.charAt(0)=='='){equal();}else if(repere.charAt(0)=='%'){percentage();}else if(repere.length()==1){proceedOp(repere);}else{
          oneParamOp(repere);}}
    }catch(RuntimeException r){if(repere.charAt(0)=='C'){textOnScreen="0";manageErasers(repere);}}
          }
  private JPanel nextButtonGrid(int lon, int larg, int hspace, int vspace){
  JPanel toReturn=new JPanel(); int r=0,i;
  toReturn.setLayout(new java.awt.GridLayout(lon,larg,hspace,vspace));
  for(i=0;i<lon*larg;i++)
  {
     r=i+toStoreFeatures;
    if(r!=23)
    {
      features[r]=new JButton(buttonNames[r]);
    }else{
      JLabel lab=new JLabel(buttonNames[r]);
      lab.setBorder(new LineBorder(Color.gray));
      features[r]=lab;
    }
    toReturn.add(features[r]);
  }
  toStoreFeatures+=i;
  return toReturn;
  }
  private JPanel enrobComponent(JPanel toEnrob,boolean enrobNorth,boolean enrobEast,boolean enrobSouth,boolean enrobWest){
    JPanel toReturn=new JPanel(); toReturn.setLayout(new java.awt.BorderLayout(10,10));
    if(enrobNorth){
    toReturn.add(new JLabel(),java.awt.BorderLayout.NORTH);}
    if(enrobEast){
    toReturn.add(new JLabel(),java.awt.BorderLayout.EAST); }
    if(enrobSouth){
    toReturn.add(new JLabel(),java.awt.BorderLayout.SOUTH); }
    if(enrobWest){
    toReturn.add(new JLabel(),java.awt.BorderLayout.WEST);
    }
     toReturn.add(toEnrob,java.awt.BorderLayout.CENTER);
     return toReturn;
    }
   private void oneParamOp(String op){//sqrt,1/x,+/-
     if(op.equals("+/-")){
     char c=' ';
   for(int i=0; i<textOnScreen.length();i++){if(textOnScreen.charAt(i)=='E'){c='E';}}
   if(c!='E'){
     if(textOnScreen.charAt(0)=='-'){textOnScreen=textOnScreen.substring(1,textOnScreen.length());}else if(!textOnScreen.equals("0")){textOnScreen="-"+textOnScreen;}
   }else{textOnScreen=eval(textOnScreen,op);}
    affiche(textOnScreen);
     }else{
       textOnScreen=eval(textOnScreen,op);
    affiche(textOnScreen);
     }
    if((proceedOp!=null)){
      if(!("=".equals(proceedOp.lastOp)&&(op.equals("+/-")))){
      proceedOp.param2=textOnScreen;
      }
    } 
    
    if(!(op.equals("+/-"))){concDigit=false;}
  }
 
  private void proceedOp(String op){//+,-,*,/
    if(proceedOp==null){
        replaceOp(op);
    }else if(proceedOp.param2==null){
      proceedOp.replaceOp(op);}else if(("=").equals(proceedOp.lastOp)){proceedOp=new Operation(textOnScreen,op,null);}else{
      textOnScreen=eval(proceedOp.param1,proceedOp.currentOp,proceedOp.param2);
      replaceOp(op);    affiche(textOnScreen);
    }
    concDigit=false; isDouble=false;
  }
     
  private void percentage(){
    if(proceedOp==null){ 
     textOnScreen="0";
     affiche(textOnScreen);
    }else if(proceedOp.param2==null){
      if(proceedOp.percent==null){
      proceedOp.percent=eval(proceedOp.param1,"*","0.01");
      textOnScreen=proceedOp.param2=eval(proceedOp.param1,"*",proceedOp.percent);
    }else{
     
      textOnScreen=proceedOp.param2=eval(proceedOp.param1,"*",proceedOp.percent);
    }
      affiche(textOnScreen);
    }else{if(proceedOp.lastOp=="="){
       proceedOp.percent=eval(proceedOp.param1,"*","0.01");
      textOnScreen=proceedOp.param2=eval(textOnScreen,"*",proceedOp.percent);
       affiche(textOnScreen);
    }else{
      proceedOp.percent=eval(proceedOp.param2,"*","0.01");
      textOnScreen=proceedOp.param2=eval(proceedOp.param1,"*",proceedOp.percent);
       affiche(textOnScreen);
    }
    }
    if(proceedOp!=null){
      proceedOp.lastOp=null;}
    concDigit=false;
  }
  private void comma(){
    if(isDouble==false){
      if(concDigit==false){textOnScreen="0";}
      affiche(textOnScreen);
      isDouble=true;currCharIsCom=true;concDigit=true;
    }
  }
 
 
  private void manageMemory(String memInfo){
    if((memInfo.charAt(memInfo.length()-1))=='C'){
      memory="0";((JLabel)features[23]).setText("              ");
    }else if((memInfo.charAt(memInfo.length()-1))=='R'){
      textOnScreen=memory;
      affiche(textOnScreen);
    }else if((memInfo.charAt(memInfo.length()-1))=='S'){
      memory=textOnScreen;if(Double.parseDouble(memory)!=0){((JLabel)features[23]).setText("     M");}
    }else if(memory!=null){
      memory=eval(memory,"+",textOnScreen);if(Double.parseDouble(memory)!=0){((JLabel)features[23]).setText("     M");}}
    concDigit=false;if(Double.parseDouble(memory)==0){((JLabel)features[23]).setText("              ");}
   
    }
 
  private void manageErasers(String erInfo){
    if((erInfo.equals("Backspace"))==true&&concDigit){
      if(currCharIsCom){currCharIsCom=false;}else
      if(textOnScreen.length()==1||(textOnScreen.length()==2&&textOnScreen.charAt(0)=='-')){textOnScreen="0";affiche(textOnScreen);concDigit=false;}else{
        if(currCharIsCom){currCharIsCom=false;}else {if(textOnScreen.charAt(textOnScreen.length()-2)==','){isDouble=false;
        }
          textOnScreen=textOnScreen.substring(0,textOnScreen.length()-1);affiche(textOnScreen);}
      }  
      if(!(proceedOp==null)){proceedOp.param2=textOnScreen;}
    }else if((erInfo.equals("CE"))==true){
      if(proceedOp!=null&&proceedOp.lastOp!="="){proceedOp.param2="0";}textOnScreen="0";affiche(textOnScreen);
      isDouble=false; concDigit=false;
    }else if(!(erInfo.equals("Backspace"))){
    proceedOp=null;textOnScreen="0";affiche(textOnScreen);isDouble=false; concDigit=false;}
  }
  private void affiche(String toPrint){
    boolean printComma=true; if(toPrint==null){System.out.println("nullpointer");}
    for(int i=0;i<toPrint.length();i++){if(toPrint.charAt(i)=='.'){printComma=false;}}
      if(printComma){toPrint+=".";}
      String space=display.getText();
      for(int j=0;toPrint.length()<50;j++){toPrint=" "+toPrint;}
      display.setText(updateComma(toPrint));
    }
 
  private void replaceOp(String op){
    if(proceedOp==null){proceedOp=new Operation(textOnScreen,op,null);}else{
      proceedOp=new Operation(textOnScreen,op,null);}
  }
 
  private String eval(String par1,String op,String par2){
    String result="";double r=0, op1=(Double.parseDouble(par1)), op2=Double.parseDouble(par2);
    if(op.equals("+")){r= op1 + op2;}
    if(op.equals("*")){r= op1 * op2;System.out.println(r);}
    if(op.equals("-")){r= op1 - op2;}
    if(op.equals("/")){if(op2==0&&op1==0){result="Result of function is undefined";}else if(op2==0){result="Cannot divide by zero";}else{r= op1 / op2;}}
    if(result.equals("")){ result+=r; }
   char c=' ';
   for(int i=0; i<result.length();i++){if(result.charAt(i)=='E'){c='E';}}
   if(c!='E'){
   for(int i=0; i<result.length();i++){if(result.charAt(i)=='.'&&Double.parseDouble(result.substring(i+1,result.length()))==0){result=result.substring(0,i+1);i=result.length();}}
   }
   return result;
  }
 
  private String eval(String par1,String op){
    String result="";double r=0, op1=(Double.parseDouble(par1));
    if(op.equals("+/-")){r= op1-2*op1 ;}
    if(op.equals("1/x")){if(op1==0){result="Cannot divide by zero";}else{r= 1 / op1;}}
    if(op.equals("sqrt")){if(op1<0){result="invalid input for function";}else{r=Math.sqrt(op1);}}
   if(result.equals("")){ result+=r; }
     char c=' ';
   for(int i=0; i<result.length();i++){if(result.charAt(i)=='E'){c='E';}}
   if(c!='E'){
   for(int i=0; i<result.length();i++){if(result.charAt(i)=='.'&&Double.parseDouble(result.substring(i+1,result.length()))==0){result=result.substring(0,i);i=result.length();}}
   }
     return result;
  }
   
  private void manageDigits(String digit){
    if(textOnScreen.length()<33){
      if(concDigit){if(currCharIsCom){textOnScreen+=".";}
        textOnScreen+=digit;if(Double.parseDouble(textOnScreen)==0&&!isDouble){textOnScreen="0";concDigit=false;}}else{
          textOnScreen=digit;if(Double.parseDouble(textOnScreen)!=0){concDigit=true;}} if(proceedOp!=null){if(!("=").equals(proceedOp.lastOp)){proceedOp.param2=textOnScreen;}}
   affiche(textOnScreen); currCharIsCom=false;
    }else if(proceedOp!=null){if(proceedOp.param2==null){textOnScreen=digit;manageDigits(digit);}}
  } 
  private void equal(){
    if(proceedOp!=null){
      if(proceedOp.param2==null){proceedOp.param2=textOnScreen;}
        proceedOp.lastOp="=";
        textOnScreen=proceedOp.param1=eval(proceedOp.param1,proceedOp.currentOp,proceedOp.param2);
    }
    affiche(textOnScreen);concDigit=false;currCharIsCom=false;isDouble=false;
  }
   
  private String updateComma(String toReturn){
    for(int i=0;i<toReturn.length();i++){if(toReturn.charAt(i)==','){toReturn=toReturn.substring(0,i)+"."+toReturn.substring(i+1,toReturn.length());i=toReturn.length();}
      if(i<toReturn.length()){ if(toReturn.charAt(i)=='.'&&i<toReturn.length()){toReturn=toReturn.substring(0,i)+","+toReturn.substring(i+1,toReturn.length());i=toReturn.length();}}}
 return toReturn;
  }
 /**
 * methode main
 */
  public static void main(String[] argv)
  {
    new calculator();
  }
}//Des tests s'imposent! ajouter une fonctionalitee scientifique