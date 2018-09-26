package ru.cbr.tomsk.multimodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.cbr.tomsk.multimodule.domain.Author;

/**
 * @author 69NovoshintseAV@cbr.ru
 *
 * Интерфейс для репозитория сущностей "Автор"
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
