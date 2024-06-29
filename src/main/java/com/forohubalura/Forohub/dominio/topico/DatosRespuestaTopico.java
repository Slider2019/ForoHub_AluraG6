package com.forohubalura.Forohub.dominio.topico;


import com.forohubalura.Forohub.dominio.curso.DatosRespuestaCurso;
import com.alura.forohub.domain.usuario.DatosRespuestaUsuario;

import java.util.Date;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, Date fechaCreacion, DatosRespuestaUsuario autor,
                                   DatosRespuestaCurso curso) {
}
