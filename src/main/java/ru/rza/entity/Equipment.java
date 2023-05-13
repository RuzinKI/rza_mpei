package ru.rza.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "equipments")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // наименование
    @Column(name = "name", columnDefinition = "VARCHAR(256)")
    private String name;

    // инвентарный номер
    @Column(name = "number_object", columnDefinition = "VARCHAR(20)")
    private Long numberObject;

    // дата прихода
    @Column(name = "data_in", columnDefinition = "DATE")
    private LocalDate dataIn;

    // дата списания
    @Column(name = "data_out", columnDefinition = "DATE")
    private LocalDate dataOut;

    // код счета
    @Column(name = "code_score", columnDefinition = "VARCHAR(10)")
    private String codeScore;


    /**======== */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    /**======== */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id")
    private Section section;

    /**======== */
    @OneToMany(mappedBy = "equipment", cascade = CascadeType.REMOVE)
    private List<FileName> files = new ArrayList<>();

    /**======== */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "equips_tags",
            joinColumns = @JoinColumn(name = "equip_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> Tags;



    // оценочная стоимость
    @Column(name = "cost_estimated", columnDefinition = "NUMERIC(11,2)")
    private Float costEstimated;

    // кол-во фактическое
    @Column(name = "count_actual", columnDefinition = "smallint" )
    private Integer countActual;

    // кол-во баланс
    @Column(name = "count_balance", columnDefinition = "smallint" )
    private Integer countBalance;

    // балансовая стоимость
    @Column(name = "cost_balance")
    private Float costBalance;


    // статус объекта
    @Column(name = "status", columnDefinition = "VARCHAR(32)")
    private String status;

    // целевая функция
    @Column(name = "function", columnDefinition = "VARCHAR(32)")
    private String function;


    @ManyToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinets cabinet;
}
