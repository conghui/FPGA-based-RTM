#ifndef GLOBAL_VAR_H

#define GLOBAL_VAR_H

extern int   g_c;
extern int   g_dx;
extern float g_dt;
extern float g_tmp[];
extern const char *g_rw_fname;

const int g_nx = 128;
const int g_ny = 128;
const int g_nz = 128;
const int g_size = g_nx * g_ny * g_nz;
const int g_niter = 5; /* number of iteration of process */


#endif /* end of include guard: GLOBAL_VAR_H */