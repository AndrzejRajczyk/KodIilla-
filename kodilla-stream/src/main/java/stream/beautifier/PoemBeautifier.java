package stream.beautifier;

public class PoemBeautifier {
    public void beautify(String s  , PoemDecorator poemDecorator){
      String result = poemDecorator.decorate(s);
        System.out.println("New beautify Poem is: " + result);

    }


}