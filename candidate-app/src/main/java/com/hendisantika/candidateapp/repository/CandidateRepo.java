package com.hendisantika.candidateapp.repository;

import com.hendisantika.candidateapp.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : candidate-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/12/17
 * Time: 19.45
 * To change this template use File | Settings | File Templates.
 */
public interface CandidateRepo extends JpaRepository<Candidate, Long> {
}
