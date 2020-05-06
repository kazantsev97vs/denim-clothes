package wellink.test.task.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wellink.test.task.entities.Color;
import wellink.test.task.repositories.ColorRepository;
import wellink.test.task.services.ColorService;
import wellink.test.task.super_classes.CRUDImpl;

/**
 * Реализация CRUD-сервиса для сущности 'Color'
 */
@Service
public class ColorServiceImpl extends CRUDImpl<Color, Long, ColorRepository> implements ColorService {

    public ColorServiceImpl(@Autowired ColorRepository repository) { super(repository); }

}