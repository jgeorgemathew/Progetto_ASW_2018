package asw.springcloud.sentence.word;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import asw.springcloud.sentence.word.*;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class SubjectClientTests {

	@Mock
	SubjectClient subject;

	@InjectMocks
	private WordServiceHystrixImpl service;

	@Test
	public void testGetSubject() {
		when(subject.getWord()).thenReturn("This");
		Assert.assertEquals("This", service.getSubject());
	}
}