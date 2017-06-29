package com.learningSpring.chap5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import com.learningSpring.chap5.data.SpittleRepository;
import com.learningSpring.chap5.web.SpittleController;

public class SpittleControllerTest {
	@Test
	public void shouldShowRecentSpittles() throws Exception{
		List<Spittle> expectedSpittles = createSpittleList(5);
		SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
		Mockito.when(mockRepository.findSpittles(Long.MAX_VALUE, 5))
		.thenReturn(expectedSpittles);
		
		SpittleController controller = new SpittleController(mockRepository);
		
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
				.build();
		
		mockMvc.perform(MockMvcRequestBuilders.get("/spittles"))
		.andExpect(MockMvcResultMatchers.view().name("spittles"))
		.andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
		.andExpect(MockMvcResultMatchers.model().attribute("spittleList",expectedSpittles));
	}
	
	private List<Spittle> createSpittleList(int count){
		List<Spittle> spittles = new ArrayList<>();
		for(int i = 0;i < count; i++){
			spittles.add(new Spittle("Spittle " + i,new Date()));
		}
		return spittles;
	}
}
