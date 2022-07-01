package com.bcit.test.demo;

import com.bcit.test.demo.Self.Self;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Links {
    public Self self;
    public Permalink permalink;
    public Thumbnail thumbnail;
}
