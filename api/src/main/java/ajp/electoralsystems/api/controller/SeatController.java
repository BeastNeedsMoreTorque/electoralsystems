package ajp.electoralsystems.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ajp.electoralsystems.api.model.SeatsRequestBean;
import ajp.electoralsystems.api.model.SeatsResponseBean;
import ajp.electoralsystems.api.service.SeatService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Andres Jimenez Penalver
 */
@RestController()
@RequestMapping("seats")
@Slf4j
public class SeatController {
	
	@Autowired SeatService service;
	
	@PostMapping
	public SeatsResponseBean getSeats(@Valid @RequestBody SeatsRequestBean requestBean) {
		log.info("creating seats");
		SeatsResponseBean response = service.getSeats(requestBean);
		return response;
	}
	
}
