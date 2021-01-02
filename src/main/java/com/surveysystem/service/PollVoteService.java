package com.surveysystem.service;

import java.util.Set;

import com.surveysystem.dto.PollVoteDto;
import com.surveysystem.entity.CPFValidationStatusResponse;
import com.surveysystem.entity.PollVote;

public interface PollVoteService {

	PollVoteDto store(PollVote pollVote);
	Set<PollVoteDto> index();
	CPFValidationStatusResponse checkCPF(String cpf);
	
}
