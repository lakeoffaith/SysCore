package core;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ijoy.mapper.CommentMapper;
import com.ijoy.modal.Comment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class CommentServiceTest {
	@Autowired
	private CommentMapper commentMapper; 
	@Test
	public  void getComments(){
		
		List<Comment> list=commentMapper.findAll();
		System.out.println(list);
	}
}




