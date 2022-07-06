package cs.miu.mystudentmgmtapp1.service.Impl;

import cs.miu.mystudentmgmtapp1.model.Transcript;
import cs.miu.mystudentmgmtapp1.repository.TranscriptRepository;
import cs.miu.mystudentmgmtapp1.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements TranscriptService {
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Override
    public Transcript addTranscript(Transcript transcript) {
      var newTranscript = transcriptRepository.save(transcript);
      return newTranscript;
    }
}
