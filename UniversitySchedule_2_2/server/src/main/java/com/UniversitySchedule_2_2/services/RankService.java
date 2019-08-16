package com.UniversitySchedule_2_2.services;

import com.UniversitySchedule_2_2.dto.RankDTO;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.exception.ResourceNotFoundException;
import com.UniversitySchedule_2_2.repositories.RankRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankService {

    @Autowired
    private RankRepository rankRepository;

    public List<RankDTO> getAllRanks() {
        return rankRepository.findAll().stream().map(RankDTO::new).collect(Collectors.toList());
    }

    public RankDTO getOneRank(Long id) {
        return new RankDTO(rankRepository.getOne(id));
    }

    public void remove(Long id){
      rankRepository.deleteById(id);
    }

    public Rank update(Long id, Rank rank) {
        return rankRepository.findById(id)
            .map(employee -> {
                employee.setId(rank.getId());
                employee.setName(rank.getName());
                return rankRepository.save(employee);
            })
            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
    }

    public Rank save (Rank rank) {
        return rankRepository.save(rank);
    }
}
