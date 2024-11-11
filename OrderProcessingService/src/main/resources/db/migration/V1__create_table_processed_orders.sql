CREATE TABLE IF NOT EXISTS processed_orders  (
    id BIGINT NOT NULL,
    products VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    price DOUBLE,
    discounted_price DOUBLE,
    date_order TIMESTAMP NOT NULL,
    processing_order TIMESTAMP NOT NULL,
    status VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);