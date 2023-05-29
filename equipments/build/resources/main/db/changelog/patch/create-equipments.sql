-- changeset ib:1
    CREATE Table equipments (
        id int primary key AUTO_INCREMENT,
        name varchar(255),
        description varchar(255),
        is_used bit
    );