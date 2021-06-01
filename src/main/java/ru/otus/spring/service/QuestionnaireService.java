package ru.otus.spring.service;

import ru.otus.spring.dao.QuestionDao;

import java.io.FileNotFoundException;

public class QuestionnaireService {

    private QuestionDao dao;

    //IoC
    public QuestionnaireService(QuestionDao dao) {
        this.dao = dao;
    }

    public void setDao(QuestionDao dao) {
        this.dao = dao;
    }

    public void playQuestions() throws FileNotFoundException {
      dao.showQuestion();
    }
}
