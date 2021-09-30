package com.fikirtepe.app.service.sectionServiceImplementation;

import com.fikirtepe.app.model.Section;
import com.fikirtepe.app.repository.SectionRepository;
import com.fikirtepe.app.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImplementation implements SectionService {
    private final SectionRepository sectionRepository;
    @Autowired
    public SectionServiceImplementation(SectionRepository sectionRepository){
        this.sectionRepository = sectionRepository;
    }

    @Override
    public Section createSection(Section section) {
        return sectionRepository.save(section);
    }

    @Override
    public List<Section> findSectionsByClassroomId(long id) {
        return sectionRepository.findSectionsByClassroomId(id);
    }

    @Override
    public Section findSectionByClassroomIdAndDayAndStartingTime(long id, String day, String startingTime) {
        return sectionRepository.findSectionByClassroomIdAndDayAndStartingTime(id, day, startingTime);
    }

    @Override
    public void deleteSection(Section section) {
        sectionRepository.delete(section);

    }
}
