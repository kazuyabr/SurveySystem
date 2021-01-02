package com.surveysystem.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surveysystem.entity.PollVote;
import com.surveysystem.entity.PollVoteKey;

public interface PollVoteRepository extends JpaRepository<PollVote, PollVoteKey>{
	
	Set<PollVote> findByPollId(Long pollId);
	Set<PollVote> findByAssociado(Long associadoId);	
}
