import java.io.FileNotFoundException;
public class Assembler{
  public static void main(String [] args){
    
    String fileName = "prog.asm";
    
    try{
      
      Parser asmParser = new Parser(fileName);
      
      while(asmParser.hasMoreCommands()){
        if(asmParser.commandType() == Commands.COMMENT){
          asmParser.advance();
          continue;
        }
        System.out.println(asmParser.commandType());
        asmParser.advance();
      }
      
      
    } catch (FileNotFoundException fnfe){
      System.out.println(String.format("File %s was not found", fileName));
    }
    
  }
  
}