package com.dassuncao.sample.r2dbc.core.port.`in`

import com.dassuncao.sample.r2dbc.core.domain.Person
import reactor.core.publisher.Flux

interface FindPersonUseCase {

    fun findPersonByName(person: Person): Flux<Person>
}
