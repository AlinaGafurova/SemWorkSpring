package ru.kpfu.itis.gafurova.service;

import ru.kpfu.itis.gafurova.model.Studio;

import java.util.List;

public interface StudioService {

    void add(Studio studio);

    Studio findOneById(Long id);

    Studio findOneByNameAndCityId(String name, Long cityId);

    List<Studio> findAllByCityId(Long city);

    List<Studio> getAll();

    void delete(Long id);
}
