package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.RANK;

import com.UniversitySchedule_2_2.dto.RankDTO;
import com.UniversitySchedule_2_2.entity.Rank;
import com.UniversitySchedule_2_2.services.RankService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RANK)
public class RankController {

  @Autowired
  private RankService rankService;

  @GetMapping("/allRanks")
  public List<RankDTO> getAllRanks() {
    return rankService.getAllRanks();
  }

  @GetMapping("/{id}")
  public RankDTO getOneRank(@PathVariable Long id) {
    return rankService.getOneRank(id);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Rank rank, @PathVariable Long id) {
    rankService.update(id, rank);
  }

  @PostMapping
  public void post(@RequestBody Rank rank) {
    rankService.save(rank);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    rankService.remove(id);
  }

}

