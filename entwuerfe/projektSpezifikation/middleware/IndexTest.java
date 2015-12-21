import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class IndexTest {
	public static void main(String[] args) throws IOException  {
		QueryHandler x_QH = new QueryHandler();
		File x_File = new File("./testQueries.txt");
		FileReader x_FR = new FileReader(x_File);
      	BufferedReader x_BR = new BufferedReader(x_FR);
      	String query[] = new String[1];
      	String answer = "";
      	String result = "";
      	Set<IntervalST.Node> x_Result = new HashSet<IntervalST.Node>();
      	while ((query[0] = x_BR.readLine()) != null) {
      		result = "";
      		if ((answer = x_BR.readLine()) != null) {
      			x_Result = x_QH.answerQuery(query);
      			for (IntervalST.Node x_Node : x_Result) {
      				result = result + x_Node.i_MutationID;
    			}
    			assertEquals(answer, result);		//compares expected answer and the result of the query
      		} else {
      			break;
      		}
      	}
	}
}