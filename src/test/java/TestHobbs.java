import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.lc.nlp4han.constituent.TreeNode;

public class TestHobbs {
    List<TreeNode> consitituentTrees;
    TreeNode pronoun;
    TreeNode goal;
    @Before
    public void setUp() {
	TreeNode s1 = new TreeNode("IP");
	s1.addChild("NP");
	s1.addChild("VP");
	s1.addChild("PU");
	/*---------------------*/
	TreeNode s1Layer11 = s1.getChild(0);
	s1Layer11.addChild("DNP");
	s1Layer11.addChild("NP");
	TreeNode s1Layer12 = s1.getChild(1);
	s1Layer12.addChild("VC");
	s1Layer12.addChild("NP");
	TreeNode s1Layer13 = s1.getChild(2);
	s1Layer13.addChild("。");
	/*---------------------*/
	TreeNode s1Layer21 = s1Layer11.getChild(0);
	s1Layer21.addChild("NP");
	s1Layer21.addChild("DEG");
	TreeNode s1Layer22 = s1Layer11.getChild(1);
	s1Layer22.addChild("NN");
	TreeNode s1Layer23 = s1Layer12.getChild(0);
	s1Layer23.addChild("是");
	TreeNode s1Layer24 = s1Layer12.getChild(1);
	s1Layer24.addChild("QP");
	s1Layer24.addChild("NP");
	/*---------------------*/
	TreeNode s1Layer31 = s1Layer21.getChild(0);
	s1Layer31.addChild("NN");
	TreeNode s1Layer32 = s1Layer21.getChild(1);
	s1Layer32.addChild("的");
	TreeNode s1Layer33 = s1Layer22.getChild(0);
	s1Layer33.addChild("妈妈");
	TreeNode s1Layer35 = s1Layer24.getChild(0);
	s1Layer35.addChild("CD");
	s1Layer35.addChild("CLP");
	TreeNode s1Layer36 = s1Layer24.getChild(1);
	s1Layer35.addChild("NN");
	/*---------------------*/
	TreeNode s1Layer41 = s1Layer31.getChild(0);
	s1Layer41.addChild("小明");
	TreeNode s1Layer44 = s1Layer35.getChild(0);
	s1Layer44.addChild("一");
	TreeNode s1Layer45 = s1Layer35.getChild(1);
	s1Layer45.addChild("M");
	TreeNode s1Layer46 = s1Layer36.getChild(0);
	s1Layer46.addChild("教师");
	/*---------------------*/
	TreeNode s1Layer53 = s1Layer45.getChild(0);
	s1Layer53.addChild("名");
	
	
	TreeNode s2 = new TreeNode("IP");
	s2.addChild("IP");
	s2.addChild("PU");
	/*---------------------*/
	TreeNode s2Layer11 = s1.getChild(0);
	s2Layer11.addChild("NP");
	s2Layer11.addChild("VP");
	TreeNode s2Layer12 = s1.getChild(1);
	s2Layer12.addChild("。");
	/*---------------------*/
	TreeNode s2Layer21 = s2Layer11.getChild(0);
	s2Layer21.addChild("NN");
	TreeNode s2Layer22 = s2Layer11.getChild(1);
	s2Layer22.addChild("ADVP");
	s2Layer22.addChild("ADVP");
	s2Layer22.addChild("VP");
	/*---------------------*/
	TreeNode s2Layer31 = s2Layer21.getChild(0);
	s2Layer31.addChild("家长们");
	TreeNode s2Layer32 = s2Layer22.getChild(0);
	s2Layer32.addChild("AD");
	TreeNode s2Layer33 = s2Layer22.getChild(1);
	s2Layer33.addChild("AD");
	TreeNode s2Layer34 = s2Layer22.getChild(2);
	s2Layer34.addChild("W");
	s2Layer34.addChild("NP");
	
	/*---------------------*/
	TreeNode s2Layer42 = s2Layer32.getChild(0);
	s2Layer42.addChild("都");
	TreeNode s2Layer43 = s2Layer33.getChild(0);
	s2Layer43.addChild("很");
	TreeNode s2Layer44 = s2Layer34.getChild(0);
	s2Layer44.addChild("欣赏");
	TreeNode s2Layer45 = s2Layer34.getChild(1);
	s2Layer45.addChild("PN");
	/*---------------------*/
	TreeNode s2Layer54 = s2Layer45.getChild(0);
	s2Layer54.addChild("她");
	
	consitituentTrees = new ArrayList<TreeNode>();
	consitituentTrees.add(s1);
	consitituentTrees.add(s2);
	pronoun = s2Layer45;
	goal = s1Layer11;
    }
    
    @Test
    public void testHobbs()
    {
	Hobbs hobbs = new HobbsImpl();
	TreeNode result = hobbs.hobbs(consitituentTrees, pronoun);
	assertEquals(goal, result);
    }
    
}
